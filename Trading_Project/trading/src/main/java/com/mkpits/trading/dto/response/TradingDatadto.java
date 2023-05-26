package com.mkpits.trading.dto.response;

import lombok.*;
import org.springframework.stereotype.Controller;

@Controller

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TradingDatadto {

       private long id;

       private String scripeName;

       private double fiftyWeeksHigh;

       private double fiftyWeeksLow;

       private double currentPrice;




}
