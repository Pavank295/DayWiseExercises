import {
  CommonModule,
  Component,
  TestBed,
  init_common,
  init_core,
  init_testing
} from "./chunk-TL73NIDW.js";
import {
  __async,
  __commonJS,
  __esm
} from "./chunk-TTULUY32.js";

// node_modules/tslib/tslib.es6.mjs
function __decorate(decorators, target, key, desc) {
  var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
  if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
  else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
  return c > 3 && r && Object.defineProperty(target, key, r), r;
}
var init_tslib_es6 = __esm({
  "node_modules/tslib/tslib.es6.mjs"() {
    "use strict";
  }
});

// angular:jit:template:src\app\app.html
var app_default;
var init_app = __esm({
  "angular:jit:template:src\\app\\app.html"() {
    app_default = `<div style="text-align:center; margin-top:40px;">\r
  <h1>Palindrome tester</h1>\r
  <input #txt placeholder="Type text" />\r
  <button (click)="result = isPalindrome(txt.value)">Test</button>\r
  <p *ngIf="result !== undefined">\r
    Result: {{ result ? 'Palindrome' : 'Not a palindrome' }}\r
  </p>\r
</div>\r
`;
  }
});

// angular:jit:style:src\app\app.css
var app_default2;
var init_app2 = __esm({
  "angular:jit:style:src\\app\\app.css"() {
    app_default2 = "/* src/app/app.css */\n/*# sourceMappingURL=app.css.map */\n";
  }
});

// src/app/app.ts
var AppComponent;
var init_app3 = __esm({
  "src/app/app.ts"() {
    "use strict";
    init_tslib_es6();
    init_app();
    init_app2();
    init_core();
    init_common();
    AppComponent = class AppComponent2 {
      title = "palindrome-app";
      result;
      isPalindrome(input) {
        if (input === null || input === void 0)
          return false;
        const normalized = input.toString().toLowerCase().replace(/[^a-z0-9]/g, "");
        const reversed = normalized.split("").reverse().join("");
        return normalized === reversed;
      }
    };
    AppComponent = __decorate([
      Component({
        selector: "app-root",
        standalone: true,
        imports: [CommonModule],
        template: app_default,
        styles: [app_default2]
      })
    ], AppComponent);
  }
});

// src/app/app.spec.ts
var require_app_spec = __commonJS({
  "src/app/app.spec.ts"(exports) {
    init_testing();
    init_app3();
    describe("AppComponent - isPalindrome()", () => {
      let component;
      beforeEach(() => __async(null, null, function* () {
        yield TestBed.configureTestingModule({
          imports: [AppComponent]
        }).compileComponents();
        const fixture = TestBed.createComponent(AppComponent);
        component = fixture.componentInstance;
      }));
      it('should return true for "madam"', () => {
        expect(component.isPalindrome("madam")).toBeTrue();
      });
      it("should return true for a sentence palindrome ignoring spaces/punctuation", () => {
        expect(component.isPalindrome("A man, a plan, a canal: Panama")).toBeTrue();
      });
      it('should return false for "hello"', () => {
        expect(component.isPalindrome("hello")).toBeFalse();
      });
      it("should consider empty string a palindrome", () => {
        expect(component.isPalindrome("")).toBeTrue();
      });
      it("should return false for null/undefined", () => {
        expect(component.isPalindrome(null)).toBeFalse();
        expect(component.isPalindrome(void 0)).toBeFalse();
      });
      it("should handle numeric palindromes as strings", () => {
        expect(component.isPalindrome("12321")).toBeTrue();
        expect(component.isPalindrome("12345")).toBeFalse();
      });
    });
  }
});
export default require_app_spec();
//# sourceMappingURL=spec-app.spec.js.map
