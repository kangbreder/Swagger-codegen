//
// PutRecurringDepositAccountsChanges.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutRecurringDepositAccountsChanges: Codable {

    public var depositAmount: Int?
    public var locale: String?

    public init(depositAmount: Int?, locale: String?) {
        self.depositAmount = depositAmount
        self.locale = locale
    }


}

