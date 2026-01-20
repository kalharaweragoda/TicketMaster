package edu.icet.controller;

import edu.icet.dto.PriceResponseDTO;
import edu.icet.dto.PricingRequestDTO;
import edu.icet.entity.Event;
import edu.icet.entity.User;
import edu.icet.service.impl.PriceCalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pricing")
@RequiredArgsConstructor
public class PricingController {

    private final PriceCalculatorService priceCalculatorService;

    @PostMapping("/calculate")
    public PriceResponseDTO calculatePrice(@RequestBody PricingRequestDTO request) {

        User user = request.getUser();
        Event event = request.getEvent();

        return priceCalculatorService.calculate(user, event);
    }
}
