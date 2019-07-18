//
// GetSavingsSummary.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSavingsSummary: Codable {

    public var currency: GetSavingsCurrency?
    public var accountBalance: Int?

    public init(currency: GetSavingsCurrency?, accountBalance: Int?) {
        self.currency = currency
        self.accountBalance = accountBalance
    }


}
