package com.example.bookingms.controller;
import java.util.List;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookingms.dto.Payment;
import com.example.bookingms.model.Booking;
import com.example.bookingms.service.BookingService;
@RestController
@RequestMapping("/bookings")
public class BookingController {
	 @Autowired
	    BookingService bookingService;


	    @PostMapping
	    Booking save(@RequestBody Booking book) {
	        System.out.println(book);
	        Booking orderReturn = bookingService.createBooking(book);
	        return orderReturn;
	    }

	    @PutMapping
	    void update(@RequestBody Booking book) {
	        bookingService.createBooking(book);
	    }

	    @PostMapping("/pay")
	    Payment pay(@RequestBody Payment pay) {
	        System.out.println(pay);
	        bookingService.pay(pay);
	        return pay;
	    }
	    @GetMapping("/{pnr}/pdf")
	    public ResponseEntity<byte[]> downloadTicket(@PathVariable String pnr) throws Exception {
	        Booking booking = bookingService.getBookingByPnr(pnr);

	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        Document doc = new Document();
	        PdfWriter.getInstance(doc, baos);
	        doc.open();
	        doc.add(new Paragraph("Ticket Confirmation"));
	        doc.add(new Paragraph("PNR: " + booking.getPnr()));
	        doc.add(new Paragraph("Passenger Name: " + booking.getPassengerName()));
	        doc.add(new Paragraph("Passenger Age: " + booking.getPassengerAge()));
	        doc.add(new Paragraph("Gender: " + booking.getGender()));
	        doc.add(new Paragraph("Email: " + booking.getEmail()));
	        doc.add(new Paragraph("Phone: " + booking.getPhone()));
	        doc.add(new Paragraph("Number of Tickets: " + booking.getNumberOfTicket()));
	        doc.add(new Paragraph("Total Price: ₹" + booking.getTotalPrice()));
	        doc.add(new Paragraph("Status: " + booking.getStatus()));
	        doc.close();

	        return ResponseEntity.ok()
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=ticket_" + booking.getPnr() + ".pdf")
	                .contentType(MediaType.APPLICATION_PDF)
	                .body(baos.toByteArray());
	    }
	    @GetMapping("/{id}")
	    public ResponseEntity<Booking> getBookingById(@PathVariable int id) {
	        Booking booking = bookingService.getBookingById(id);
	        if (booking != null) {
	            return ResponseEntity.ok(booking);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
}