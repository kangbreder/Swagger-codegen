//
// GetLoansLoanIdTransactionsTemplateResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoansLoanIdTransactionsTemplateResponse: Codable {

    public var transactionType: GetLoansTransactionType?
    public var date: Date?
    public var total: GetLoansTotal?

    public init(transactionType: GetLoansTransactionType?, date: Date?, total: GetLoansTotal?) {
        self.transactionType = transactionType
        self.date = date
        self.total = total
    }


}
