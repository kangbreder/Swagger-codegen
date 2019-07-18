//
// GetSavingsAccountsSummary.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSavingsAccountsSummary: Codable {

    public var currency: GetSavingsCurrency?
    public var accountBalance: Int?
    public var availableBalance: Int?

    public init(currency: GetSavingsCurrency?, accountBalance: Int?, availableBalance: Int?) {
        self.currency = currency
        self.accountBalance = accountBalance
        self.availableBalance = availableBalance
    }


}

