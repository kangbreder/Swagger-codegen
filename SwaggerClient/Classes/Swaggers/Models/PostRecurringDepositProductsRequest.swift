//
// PostRecurringDepositProductsRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostRecurringDepositProductsRequest: Codable {

    public var name: String?
    public var shortName: String?
    public var _description: String?
    public var currencyCode: String?
    public var digitsAfterDecimal: Int?
    public var inMultiplesOf: Int?
    public var locale: String?
    public var interestCompoundingPeriodType: Int?
    public var interestPostingPeriodType: Int?
    public var interestCalculationType: Int?
    public var interestCalculationDaysInYearType: Int?
    public var accountingRule: Int?
    public var recurringDepositFrequency: Int?
    public var recurringDepositFrequencyTypeId: Int?
    public var preClosurePenalApplicable: Bool?
    public var preClosurePenalInterest: Double?
    public var preClosurePenalInterestOnTypeId: Int?
    public var minDepositTerm: Int?
    public var minDepositTermTypeId: Int?
    public var maxDepositTerm: Int?
    public var maxDepositTermTypeId: Int?
    public var depositAmount: Int64?
    public var minDepositAmount: Int64?
    public var maxDepositAmount: Int64?
    public var charts: [PostRecurringDepositProductsCharts]?

    public init(name: String?, shortName: String?, _description: String?, currencyCode: String?, digitsAfterDecimal: Int?, inMultiplesOf: Int?, locale: String?, interestCompoundingPeriodType: Int?, interestPostingPeriodType: Int?, interestCalculationType: Int?, interestCalculationDaysInYearType: Int?, accountingRule: Int?, recurringDepositFrequency: Int?, recurringDepositFrequencyTypeId: Int?, preClosurePenalApplicable: Bool?, preClosurePenalInterest: Double?, preClosurePenalInterestOnTypeId: Int?, minDepositTerm: Int?, minDepositTermTypeId: Int?, maxDepositTerm: Int?, maxDepositTermTypeId: Int?, depositAmount: Int64?, minDepositAmount: Int64?, maxDepositAmount: Int64?, charts: [PostRecurringDepositProductsCharts]?) {
        self.name = name
        self.shortName = shortName
        self._description = _description
        self.currencyCode = currencyCode
        self.digitsAfterDecimal = digitsAfterDecimal
        self.inMultiplesOf = inMultiplesOf
        self.locale = locale
        self.interestCompoundingPeriodType = interestCompoundingPeriodType
        self.interestPostingPeriodType = interestPostingPeriodType
        self.interestCalculationType = interestCalculationType
        self.interestCalculationDaysInYearType = interestCalculationDaysInYearType
        self.accountingRule = accountingRule
        self.recurringDepositFrequency = recurringDepositFrequency
        self.recurringDepositFrequencyTypeId = recurringDepositFrequencyTypeId
        self.preClosurePenalApplicable = preClosurePenalApplicable
        self.preClosurePenalInterest = preClosurePenalInterest
        self.preClosurePenalInterestOnTypeId = preClosurePenalInterestOnTypeId
        self.minDepositTerm = minDepositTerm
        self.minDepositTermTypeId = minDepositTermTypeId
        self.maxDepositTerm = maxDepositTerm
        self.maxDepositTermTypeId = maxDepositTermTypeId
        self.depositAmount = depositAmount
        self.minDepositAmount = minDepositAmount
        self.maxDepositAmount = maxDepositAmount
        self.charts = charts
    }

    public enum CodingKeys: String, CodingKey { 
        case name
        case shortName
        case _description = "description"
        case currencyCode
        case digitsAfterDecimal
        case inMultiplesOf
        case locale
        case interestCompoundingPeriodType
        case interestPostingPeriodType
        case interestCalculationType
        case interestCalculationDaysInYearType
        case accountingRule
        case recurringDepositFrequency
        case recurringDepositFrequencyTypeId
        case preClosurePenalApplicable
        case preClosurePenalInterest
        case preClosurePenalInterestOnTypeId
        case minDepositTerm
        case minDepositTermTypeId
        case maxDepositTerm
        case maxDepositTermTypeId
        case depositAmount
        case minDepositAmount
        case maxDepositAmount
        case charts
    }


}

