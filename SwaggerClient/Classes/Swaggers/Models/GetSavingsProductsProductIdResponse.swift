//
// GetSavingsProductsProductIdResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSavingsProductsProductIdResponse: Codable {

    public var _id: Int?
    public var name: String?
    public var shortName: String?
    public var _description: String?
    public var currency: GetSavingsCurrency?
    public var nominalAnnualInterestRate: Double?
    public var interestCompoundingPeriodType: GetSavingsProductsInterestCompoundingPeriodType?
    public var interestPostingPeriodType: GetSavingsProductsInterestPostingPeriodType?
    public var interestCalculationType: GetSavingsProductsInterestCalculationType?
    public var interestCalculationDaysInYearType: GetSavingsProductsInterestCalculationDaysInYearType?
    public var withdrawalFeeForTransfers: Bool?
    public var accountingRule: GetSavingsProductsAccountingRule?
    public var accountingMappings: GetSavingsProductsAccountingMappings?
    public var paymentChannelToFundSourceMappings: [GetSavingsProductsPaymentChannelToFundSourceMappings]?
    public var feeToIncomeAccountMappings: [GetSavingsProductsFeeToIncomeAccountMappings]?
    public var penaltyToIncomeAccountMappings: [GetSavingsProductsPenaltyToIncomeAccountMappings]?
    public var charges: [Int]?

    public init(_id: Int?, name: String?, shortName: String?, _description: String?, currency: GetSavingsCurrency?, nominalAnnualInterestRate: Double?, interestCompoundingPeriodType: GetSavingsProductsInterestCompoundingPeriodType?, interestPostingPeriodType: GetSavingsProductsInterestPostingPeriodType?, interestCalculationType: GetSavingsProductsInterestCalculationType?, interestCalculationDaysInYearType: GetSavingsProductsInterestCalculationDaysInYearType?, withdrawalFeeForTransfers: Bool?, accountingRule: GetSavingsProductsAccountingRule?, accountingMappings: GetSavingsProductsAccountingMappings?, paymentChannelToFundSourceMappings: [GetSavingsProductsPaymentChannelToFundSourceMappings]?, feeToIncomeAccountMappings: [GetSavingsProductsFeeToIncomeAccountMappings]?, penaltyToIncomeAccountMappings: [GetSavingsProductsPenaltyToIncomeAccountMappings]?, charges: [Int]?) {
        self._id = _id
        self.name = name
        self.shortName = shortName
        self._description = _description
        self.currency = currency
        self.nominalAnnualInterestRate = nominalAnnualInterestRate
        self.interestCompoundingPeriodType = interestCompoundingPeriodType
        self.interestPostingPeriodType = interestPostingPeriodType
        self.interestCalculationType = interestCalculationType
        self.interestCalculationDaysInYearType = interestCalculationDaysInYearType
        self.withdrawalFeeForTransfers = withdrawalFeeForTransfers
        self.accountingRule = accountingRule
        self.accountingMappings = accountingMappings
        self.paymentChannelToFundSourceMappings = paymentChannelToFundSourceMappings
        self.feeToIncomeAccountMappings = feeToIncomeAccountMappings
        self.penaltyToIncomeAccountMappings = penaltyToIncomeAccountMappings
        self.charges = charges
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case shortName
        case _description = "description"
        case currency
        case nominalAnnualInterestRate
        case interestCompoundingPeriodType
        case interestPostingPeriodType
        case interestCalculationType
        case interestCalculationDaysInYearType
        case withdrawalFeeForTransfers
        case accountingRule
        case accountingMappings
        case paymentChannelToFundSourceMappings
        case feeToIncomeAccountMappings
        case penaltyToIncomeAccountMappings
        case charges
    }


}

