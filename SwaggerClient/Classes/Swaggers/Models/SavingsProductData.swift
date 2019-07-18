//
// SavingsProductData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct SavingsProductData: Codable {

    public var _id: Int64?
    public var name: String?
    public var currency: CurrencyData?
    public var nominalAnnualInterestRate: Double?
    public var interestCompoundingPeriodType: EnumOptionData?
    public var interestPostingPeriodType: EnumOptionData?
    public var interestCalculationType: EnumOptionData?
    public var interestCalculationDaysInYearType: EnumOptionData?
    public var minRequiredOpeningBalance: Double?
    public var lockinPeriodFrequency: Int?
    public var lockinPeriodFrequencyType: EnumOptionData?
    public var withdrawalFeeForTransfers: Bool?
    public var allowOverdraft: Bool?
    public var overdraftLimit: Double?
    public var minRequiredBalance: Double?
    public var depositAccountType: String?

    public init(_id: Int64?, name: String?, currency: CurrencyData?, nominalAnnualInterestRate: Double?, interestCompoundingPeriodType: EnumOptionData?, interestPostingPeriodType: EnumOptionData?, interestCalculationType: EnumOptionData?, interestCalculationDaysInYearType: EnumOptionData?, minRequiredOpeningBalance: Double?, lockinPeriodFrequency: Int?, lockinPeriodFrequencyType: EnumOptionData?, withdrawalFeeForTransfers: Bool?, allowOverdraft: Bool?, overdraftLimit: Double?, minRequiredBalance: Double?, depositAccountType: String?) {
        self._id = _id
        self.name = name
        self.currency = currency
        self.nominalAnnualInterestRate = nominalAnnualInterestRate
        self.interestCompoundingPeriodType = interestCompoundingPeriodType
        self.interestPostingPeriodType = interestPostingPeriodType
        self.interestCalculationType = interestCalculationType
        self.interestCalculationDaysInYearType = interestCalculationDaysInYearType
        self.minRequiredOpeningBalance = minRequiredOpeningBalance
        self.lockinPeriodFrequency = lockinPeriodFrequency
        self.lockinPeriodFrequencyType = lockinPeriodFrequencyType
        self.withdrawalFeeForTransfers = withdrawalFeeForTransfers
        self.allowOverdraft = allowOverdraft
        self.overdraftLimit = overdraftLimit
        self.minRequiredBalance = minRequiredBalance
        self.depositAccountType = depositAccountType
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case currency
        case nominalAnnualInterestRate
        case interestCompoundingPeriodType
        case interestPostingPeriodType
        case interestCalculationType
        case interestCalculationDaysInYearType
        case minRequiredOpeningBalance
        case lockinPeriodFrequency
        case lockinPeriodFrequencyType
        case withdrawalFeeForTransfers
        case allowOverdraft
        case overdraftLimit
        case minRequiredBalance
        case depositAccountType
    }


}

