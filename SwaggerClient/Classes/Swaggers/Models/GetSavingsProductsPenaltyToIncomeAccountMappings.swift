//
// GetSavingsProductsPenaltyToIncomeAccountMappings.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSavingsProductsPenaltyToIncomeAccountMappings: Codable {

    public var charge: GetSavingsProductsPenaltyToIncomeAccountMappingsCharge?
    public var incomeAccount: GetSavingsProductsIncomeFromPenaltyAccount?

    public init(charge: GetSavingsProductsPenaltyToIncomeAccountMappingsCharge?, incomeAccount: GetSavingsProductsIncomeFromPenaltyAccount?) {
        self.charge = charge
        self.incomeAccount = incomeAccount
    }


}

