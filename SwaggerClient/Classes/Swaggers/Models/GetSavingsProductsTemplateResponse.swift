//
// GetSavingsProductsTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSavingsProductsTemplateResponse: Codable {

    public var currency: GetSavingsCurrency?
    public var interestCompoundingPeriodType: GetSavingsProductsInterestCompoundingPeriodType?
    public var interestPostingPeriodType: GetSavingsProductsInterestPostingPeriodType?
    public var interestCalculationType: GetSavingsProductsInterestCalculationType?
    public var interestCalculationDaysInYearType: GetSavingsProductsInterestCalculationDaysInYearType?
    public var accountingRule: GetSavingsProductsTemplateAccountingRule?
    public var currencyOptions: [GetSavingsCurrency]?
    public var interestCompoundingPeriodTypeOptions: [GetSavingsProductsInterestCompoundingPeriodType]?
    public var interestPostingPeriodTypeOptions: [GetSavingsProductsInterestPostingPeriodType]?
    public var interestCalculationTypeOptions: [GetSavingsProductsInterestCalculationType]?
    public var interestCalculationDaysInYearTypeOptions: [GetSavingsProductsInterestCalculationDaysInYearType]?
    public var lockinPeriodFrequencyTypeOptions: [GetSavingsProductsLockinPeriodFrequencyTypeOptions]?
    public var withdrawalFeeTypeOptions: [GetSavingsProductsWithdrawalFeeTypeOptions]?
    public var paymentTypeOptions: [GetSavingsProductsPaymentTypeOptions]?
    public var accountingRuleOptions: [GetSavingsProductsTemplateAccountingRule]?
    public var accountingMappingOptions: [GetSavingsProductsAccountingMappingOptions]?
    public var chargeOptions: [GetSavingsProductsChargeOptions]?

    public init(currency: GetSavingsCurrency?, interestCompoundingPeriodType: GetSavingsProductsInterestCompoundingPeriodType?, interestPostingPeriodType: GetSavingsProductsInterestPostingPeriodType?, interestCalculationType: GetSavingsProductsInterestCalculationType?, interestCalculationDaysInYearType: GetSavingsProductsInterestCalculationDaysInYearType?, accountingRule: GetSavingsProductsTemplateAccountingRule?, currencyOptions: [GetSavingsCurrency]?, interestCompoundingPeriodTypeOptions: [GetSavingsProductsInterestCompoundingPeriodType]?, interestPostingPeriodTypeOptions: [GetSavingsProductsInterestPostingPeriodType]?, interestCalculationTypeOptions: [GetSavingsProductsInterestCalculationType]?, interestCalculationDaysInYearTypeOptions: [GetSavingsProductsInterestCalculationDaysInYearType]?, lockinPeriodFrequencyTypeOptions: [GetSavingsProductsLockinPeriodFrequencyTypeOptions]?, withdrawalFeeTypeOptions: [GetSavingsProductsWithdrawalFeeTypeOptions]?, paymentTypeOptions: [GetSavingsProductsPaymentTypeOptions]?, accountingRuleOptions: [GetSavingsProductsTemplateAccountingRule]?, accountingMappingOptions: [GetSavingsProductsAccountingMappingOptions]?, chargeOptions: [GetSavingsProductsChargeOptions]?) {
        self.currency = currency
        self.interestCompoundingPeriodType = interestCompoundingPeriodType
        self.interestPostingPeriodType = interestPostingPeriodType
        self.interestCalculationType = interestCalculationType
        self.interestCalculationDaysInYearType = interestCalculationDaysInYearType
        self.accountingRule = accountingRule
        self.currencyOptions = currencyOptions
        self.interestCompoundingPeriodTypeOptions = interestCompoundingPeriodTypeOptions
        self.interestPostingPeriodTypeOptions = interestPostingPeriodTypeOptions
        self.interestCalculationTypeOptions = interestCalculationTypeOptions
        self.interestCalculationDaysInYearTypeOptions = interestCalculationDaysInYearTypeOptions
        self.lockinPeriodFrequencyTypeOptions = lockinPeriodFrequencyTypeOptions
        self.withdrawalFeeTypeOptions = withdrawalFeeTypeOptions
        self.paymentTypeOptions = paymentTypeOptions
        self.accountingRuleOptions = accountingRuleOptions
        self.accountingMappingOptions = accountingMappingOptions
        self.chargeOptions = chargeOptions
    }


}

