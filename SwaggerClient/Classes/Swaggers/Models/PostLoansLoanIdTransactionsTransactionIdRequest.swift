//
// PostLoansLoanIdTransactionsTransactionIdRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostLoansLoanIdTransactionsTransactionIdRequest: Codable {

    public var locale: String?
    public var dateFormat: String?
    public var transactionDate: String?
    public var transactionAmount: Double?
    public var note: String?

    public init(locale: String?, dateFormat: String?, transactionDate: String?, transactionAmount: Double?, note: String?) {
        self.locale = locale
        self.dateFormat = dateFormat
        self.transactionDate = transactionDate
        self.transactionAmount = transactionAmount
        self.note = note
    }


}

