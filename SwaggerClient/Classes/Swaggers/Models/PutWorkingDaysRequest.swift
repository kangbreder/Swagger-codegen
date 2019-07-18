//
// PutWorkingDaysRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutWorkingDaysRequest: Codable {

    public var recurrence: String?
    public var locale: String?
    public var repaymentRescheduleType: EnumOptionData?
    public var extendTermForDailyRepayments: Bool?

    public init(recurrence: String?, locale: String?, repaymentRescheduleType: EnumOptionData?, extendTermForDailyRepayments: Bool?) {
        self.recurrence = recurrence
        self.locale = locale
        self.repaymentRescheduleType = repaymentRescheduleType
        self.extendTermForDailyRepayments = extendTermForDailyRepayments
    }


}

