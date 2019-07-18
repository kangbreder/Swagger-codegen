//
// PostRecurringDepositAccountsAccountIdResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostRecurringDepositAccountsAccountIdResponse: Codable {

    public var officeId: Int?
    public var clientId: Int?
    public var savingsId: Int?
    public var resourceId: Int?

    public init(officeId: Int?, clientId: Int?, savingsId: Int?, resourceId: Int?) {
        self.officeId = officeId
        self.clientId = clientId
        self.savingsId = savingsId
        self.resourceId = resourceId
    }


}

