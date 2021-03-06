//
// PostRecurringDepositAccountsRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostRecurringDepositAccountsRequest: Codable {

    public var clientId: Int?
    public var productId: Int?
    public var locale: String?
    public var dateFormat: String?
    public var submittedOnDate: String?
    public var depositPeriod: Int?
    public var depositPeriodFrequencyId: Int?
    public var depositAmount: Float?
    public var isCalendarInherited: Bool?
    public var recurringFrequency: Int?
    public var recurringFrequencyType: Int?
    public var mandatoryRecommendedDepositAmount: Int64?

    public init(clientId: Int?, productId: Int?, locale: String?, dateFormat: String?, submittedOnDate: String?, depositPeriod: Int?, depositPeriodFrequencyId: Int?, depositAmount: Float?, isCalendarInherited: Bool?, recurringFrequency: Int?, recurringFrequencyType: Int?, mandatoryRecommendedDepositAmount: Int64?) {
        self.clientId = clientId
        self.productId = productId
        self.locale = locale
        self.dateFormat = dateFormat
        self.submittedOnDate = submittedOnDate
        self.depositPeriod = depositPeriod
        self.depositPeriodFrequencyId = depositPeriodFrequencyId
        self.depositAmount = depositAmount
        self.isCalendarInherited = isCalendarInherited
        self.recurringFrequency = recurringFrequency
        self.recurringFrequencyType = recurringFrequencyType
        self.mandatoryRecommendedDepositAmount = mandatoryRecommendedDepositAmount
    }


}

