package com.mkpits.trading.services.Impl;

import com.mkpits.trading.dto.response.TradingDatadto;
import com.mkpits.trading.services.TradingDataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Qualifier
@Service

public class TradingDataServiceImpl implements TradingDataService {


    @Override
    public List<TradingDatadto> getTradingData() {

        List<TradingDatadto> tradingDatadtoList = new ArrayList<>();

        TradingDatadto tradingDataDtoList1 = TradingDatadto.builder()
                .fiftyWeeksHigh(200000.98)
                .fiftyWeeksLow(5467.344)
                .scripeName("Pranu Ltd")
                .currentPrice(20000.786)
                .build();


        TradingDatadto tradingDataDtoList5 = TradingDatadto.builder()
                .fiftyWeeksHigh(200000.98)
                .fiftyWeeksLow(5467.344)
                .scripeName("Pranu Ltd")
                .currentPrice(20000.786)
                .build();


        TradingDatadto tradingDataDtoList3 = TradingDatadto.builder()
                .fiftyWeeksHigh(200000.98)
                .fiftyWeeksLow(5467.344)
                .scripeName("Pranu Ltd")
                .currentPrice(20000.786)
                .build();


        TradingDatadto tradingDataDtoList2 = TradingDatadto.builder()
                .fiftyWeeksHigh(200000.98)
                .fiftyWeeksLow(5467.344)
                .scripeName("Pranu Ltd")
                .currentPrice(20000.786)
                .build();


        TradingDatadto tradingDataDtoList4 = TradingDatadto.builder()
                .fiftyWeeksHigh(200000.98)
                .fiftyWeeksLow(5467.344)
                .scripeName("Pranu Ltd")
                .currentPrice(20000.786)
                .build();


        tradingDatadtoList.add(tradingDataDtoList1);
        tradingDatadtoList.add(tradingDataDtoList2);
        tradingDatadtoList.add(tradingDataDtoList3);
        tradingDatadtoList.add(tradingDataDtoList4);
        tradingDatadtoList.add(tradingDataDtoList5);

        return tradingDatadtoList;
    }

}
