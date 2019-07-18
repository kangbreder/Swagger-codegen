//
// GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse: Codable {

    public var _id: Int?
    public var transactionType: GetRecurringTransactionType?
    public var accountId: Int?
    public var accountNo: String?
    public var date: Date?
    public var currency: GetRecurringCurrency?
    public var amount: Double?
    public var reversed: Bool?
    public var paymentTypeOptions: [Int]?

    public init(_id: Int?, transactionType: GetRecurringTransactionType?, accountId: Int?, accountNo: String?, date: Date?, currency: GetRecurringCurrency?, amount: Double?, reversed: Bool?, paymentTypeOptions: [Int]?) {
        self._id = _id
        self.transactionType = transactionType
        self.accountId = accountId
        self.accountNo = accountNo
        self.date = date
        self.currency = currency
        self.amount = amount
        self.reversed = reversed
        self.paymentTypeOptions = paymentTypeOptions
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case transactionType
        case accountId
        case accountNo
        case date
        case currency
        case amount
        case reversed
        case paymentTypeOptions
    }


}

