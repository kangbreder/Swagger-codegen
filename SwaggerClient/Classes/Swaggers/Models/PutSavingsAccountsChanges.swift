//
// PutSavingsAccountsChanges.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutSavingsAccountsChanges: Codable {

    public var nominalAnnualInterestRate: Double?
    public var locale: String?

    public init(nominalAnnualInterestRate: Double?, locale: String?) {
        self.nominalAnnualInterestRate = nominalAnnualInterestRate
        self.locale = locale
    }


}

