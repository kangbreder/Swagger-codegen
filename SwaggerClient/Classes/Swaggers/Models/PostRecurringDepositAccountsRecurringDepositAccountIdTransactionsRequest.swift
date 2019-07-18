//
// PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest: Codable {

    public var locale: String?
    public var dateFormat: String?
    public var transactionDate: String?
    public var transactionAmount: Double?
    public var paymentTypeId: Int?
    public var accountNumber: String?
    public var checkNumber: String?
    public var routingCode: String?
    public var receiptNumber: String?
    public var bankNumber: String?

    public init(locale: String?, dateFormat: String?, transactionDate: String?, transactionAmount: Double?, paymentTypeId: Int?, accountNumber: String?, checkNumber: String?, routingCode: String?, receiptNumber: String?, bankNumber: String?) {
        self.locale = locale
        self.dateFormat = dateFormat
        self.transactionDate = transactionDate
        self.transactionAmount = transactionAmount
        self.paymentTypeId = paymentTypeId
        self.accountNumber = accountNumber
        self.checkNumber = checkNumber
        self.routingCode = routingCode
        self.receiptNumber = receiptNumber
        self.bankNumber = bankNumber
    }


}
