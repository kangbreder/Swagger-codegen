//
// PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdRequest: Codable {

    public var dateFormat: String?
    public var locale: String?
    public var amount: Float?
    public var dueDate: String?

    public init(dateFormat: String?, locale: String?, amount: Float?, dueDate: String?) {
        self.dateFormat = dateFormat
        self.locale = locale
        self.amount = amount
        self.dueDate = dueDate
    }


}
