//
// GetRecurringDepositAccountsSummary.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetRecurringDepositAccountsSummary: Codable {

    public var currency: GetRecurringDepositAccountsCurrency?
    public var accountBalance: Float?

    public init(currency: GetRecurringDepositAccountsCurrency?, accountBalance: Float?) {
        self.currency = currency
        self.accountBalance = accountBalance
    }


}

