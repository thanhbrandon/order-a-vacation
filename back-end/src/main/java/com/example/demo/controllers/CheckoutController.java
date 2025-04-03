// This code defines a Spring Boot REST API controller for handling checkout operations
package com.example.demo.controllers;

import com.example.demo.services.CheckoutService;
import com.example.demo.services.Purchase;
import com.example.demo.services.PurchaseResponse;
import org.springframework.web.bind.annotation.*;

//Allows requests from http://localhost:4200 (Angular frontend) to bypass CORS restrictions when calling this API.
@CrossOrigin("http://localhost:4200") //Without this annotation, the browser would block requests from different origins.
@RestController //Marks this class as a REST API controller (it returns JSON responses).
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase") //@PostMapping("/purchase") → Defines a POST endpoint at /api/checkout/purchase.
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) { //@RequestBody Purchase purchase → Converts the incoming JSON request into a Purchase Java object
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
