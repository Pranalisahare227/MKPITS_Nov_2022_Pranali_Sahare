package com.mkpits.trading.services;

import com.mkpits.trading.dto.response.TradingDatadto;

import java.util.List;

public interface TradingDataService {

    public List<TradingDatadto> getTradingData();
}
