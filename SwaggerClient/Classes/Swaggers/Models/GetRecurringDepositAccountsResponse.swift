//
// GetRecurringDepositAccountsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetRecurringDepositAccountsResponse: Codable {

    public var _id: Int?
    public var accountNo: Int64?
    public var clientId: Int?
    public var clientName: String?
    public var savingsProductId: Int?
    public var savingsProductName: String?
    public var fieldOfficerId: Int?
    public var status: GetRecurringDepositAccountsStatus?
    public var timeline: GetRecurringDepositAccountsTimeline?
    public var currency: GetRecurringDepositAccountsCurrency?
    public var interestCompoundingPeriodType: GetRecurringDepositAccountsInterestCompoundingPeriodType?
    public var interestPostingPeriodType: GetRecurringDepositAccountsInterestPostingPeriodType?
    public var interestCalculationType: GetRecurringDepositAccountsInterestCalculationType?
    public var interestCalculationDaysInYearType: GetRecurringDepositAccountsInterestCalculationDaysInYearType?
    public var summary: GetRecurringDepositAccountsSummary?
    public var depositAmount: Float?
    public var maturityAmount: Float?
    public var maturityDate: Date?
    public var recurringDepositAmount: Int?
    public var recurringDepositFrequency: Int?
    public var recurringDepositFrequencyType: GetRecurringDepositAccountsRecurringDepositFrequencyType?
    public var preClosurePenalApplicable: Bool?
    public var minDepositTerm: Int?
    public var maxDepositTerm: Int?
    public var minDepositTermType: GetRecurringDepositAccountsMinDepositTermType?
    public var maxDepositTermType: GetRecurringDepositAccountsMaxDepositTermType?
    public var depositPeriod: Int?
    public var depositPeriodFrequency: GetRecurringDepositAccountsDepositPeriodFrequency?

    public init(_id: Int?, accountNo: Int64?, clientId: Int?, clientName: String?, savingsProductId: Int?, savingsProductName: String?, fieldOfficerId: Int?, status: GetRecurringDepositAccountsStatus?, timeline: GetRecurringDepositAccountsTimeline?, currency: GetRecurringDepositAccountsCurrency?, interestCompoundingPeriodType: GetRecurringDepositAccountsInterestCompoundingPeriodType?, interestPostingPeriodType: GetRecurringDepositAccountsInterestPostingPeriodType?, interestCalculationType: GetRecurringDepositAccountsInterestCalculationType?, interestCalculationDaysInYearType: GetRecurringDepositAccountsInterestCalculationDaysInYearType?, summary: GetRecurringDepositAccountsSummary?, depositAmount: Float?, maturityAmount: Float?, maturityDate: Date?, recurringDepositAmount: Int?, recurringDepositFrequency: Int?, recurringDepositFrequencyType: GetRecurringDepositAccountsRecurringDepositFrequencyType?, preClosurePenalApplicable: Bool?, minDepositTerm: Int?, maxDepositTerm: Int?, minDepositTermType: GetRecurringDepositAccountsMinDepositTermType?, maxDepositTermType: GetRecurringDepositAccountsMaxDepositTermType?, depositPeriod: Int?, depositPeriodFrequency: GetRecurringDepositAccountsDepositPeriodFrequency?) {
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
        self.interestCompoundingPeriodType = interestCompoundingPeriodType
        self.interestPostingPeriodType = interestPostingPeriodType
        self.interestCalculationType = interestCalculationType
        self.interestCalculationDaysInYearType = interestCalculationDaysInYearType
        self.summary = summary
        self.depositAmount = depositAmount
        self.maturityAmount = maturityAmount
        self.maturityDate = maturityDate
        self.recurringDepositAmount = recurringDepositAmount
        self.recurringDepositFrequency = recurringDepositFrequency
        self.recurringDepositFrequencyType = recurringDepositFrequencyType
        self.preClosurePenalApplicable = preClosurePenalApplicable
        self.minDepositTerm = minDepositTerm
        self.maxDepositTerm = maxDepositTerm
        self.minDepositTermType = minDepositTermType
        self.maxDepositTermType = maxDepositTermType
        self.depositPeriod = depositPeriod
        self.depositPeriodFrequency = depositPeriodFrequency
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
        case interestCompoundingPeriodType
        case interestPostingPeriodType
        case interestCalculationType
        case interestCalculationDaysInYearType
        case summary
        case depositAmount
        case maturityAmount
        case maturityDate
        case recurringDepositAmount
        case recurringDepositFrequency
        case recurringDepositFrequencyType
        case preClosurePenalApplicable
        case minDepositTerm
        case maxDepositTerm
        case minDepositTermType
        case maxDepositTermType
        case depositPeriod
        case depositPeriodFrequency
    }


}
