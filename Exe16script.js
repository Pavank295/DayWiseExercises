let images = [
    "https://picsum.photos/id/1015/400/250",
    "https://picsum.photos/id/1016/400/250",
    "https://picsum.photos/id/1018/400/250",
    "https://picsum.photos/id/1020/400/250",
    "https://picsum.photos/id/1024/400/250"
];

let currentIndex = 0;

function showImage() {
    document.getElementById("galleryImage").src = images[currentIndex];
}

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    showImage();
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage();
}

showImage();
