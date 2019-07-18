//
// GetSelfSavingsAccountsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSelfSavingsAccountsResponse: Codable {

    public var _id: Int?
    public var accountNo: Int64?
    public var clientId: Int?
    public var clientName: String?
    public var savingsProductId: Int?
    public var savingsProductName: String?
    public var fieldOfficerId: Int?
    public var status: GetSelfSavingsStatus?
    public var timeline: GetSelfSavingsTimeline?
    public var currency: GetSelfSavingsCurrency?
    public var nominalAnnualInterestRate: Double?
    public var interestCompoundingPeriodType: GetSelfSavingsInterestCompoundingPeriodType?
    public var interestPostingPeriodType: GetSelfSavingsInterestPostingPeriodType?
    public var interestCalculationType: GetSelfSavingsInterestCalculationType?
    public var interestCalculationDaysInYearType: GetSelfSavingsInterestCalculationDaysInYearType?
    public var summary: GetSelfSavingsSummary?

    public init(_id: Int?, accountNo: Int64?, clientId: Int?, clientName: String?, savingsProductId: Int?, savingsProductName: String?, fieldOfficerId: Int?, status: GetSelfSavingsStatus?, timeline: GetSelfSavingsTimeline?, currency: GetSelfSavingsCurrency?, nominalAnnualInterestRate: Double?, interestCompoundingPeriodType: GetSelfSavingsInterestCompoundingPeriodType?, interestPostingPeriodType: GetSelfSavingsInterestPostingPeriodType?, interestCalculationType: GetSelfSavingsInterestCalculationType?, interestCalculationDaysInYearType: GetSelfSavingsInterestCalculationDaysInYearType?, summary: GetSelfSavingsSummary?) {
        self._id = _id
        self.accountNo = accountNo
        self.clientId = clientId
        self.clientName = clientName
        self.savingsProductId = savingsProductId
        self.savingsProductName = savingsProductName
        self.fieldOfficerId = fieldOfficerId
        self.status = status
        self.timeline = timeline
        self.currency = currency
        self.nominalAnnualInterestRate = nominalAnnualInterestRate
        self.interestCompoundingPeriodType = interestCompoundingPeriodType
        self.interestPostingPeriodType = interestPostingPeriodType
        self.interestCalculationType = interestCalculationType
        self.interestCalculationDaysInYearType = interestCalculationDaysInYearType
        self.summary = summary
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case accountNo
        case clientId
        case clientName
        case savingsProductId
        case savingsProductName
        case fieldOfficerId
        case status
        case timeline
        case currency
        case nominalAnnualInterestRate
        case interestCompoundingPeriodType
        case interestPostingPeriodType
        case interestCalculationType
        case interestCalculationDaysInYearType
        case summary
    }


}

