/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.tp2_design_patterns.behavioural.mediator;

/**
 *
 * @author cnyaba
 */
class DollarConvertor {
    Mediator mediator;
    public static final float DOLLAR_UNTIS = 1.0f;
    public static final float EURO_UNIT = 0.7f;
    public static final float KRONA_UNIT = 8.0f;
    
    public DollarConvertor(Mediator mediator){
        this.mediator = mediator;
        mediator.registerDollarConvertor(this);
    }
    public float convertEurosToDollars(float euros){
        float dollars = euros * (DOLLAR_UNTIS / EURO_UNIT);
        return dollars;
    }
    public float convertKronorToDollars(float kronor){
        float dollars  = kronor * (DOLLAR_UNTIS / KRONA_UNIT);
        return dollars;
    }
    public float convertCurrencyToDollars(float amount, String unitOfCurrency){
        if("krona".equalsIgnoreCase(unitOfCurrency)){
            return convertKronorToDollars(amount);
        }
        else
            return convertEurosToDollars(amount);
    }
}
