//
// PutRecurringDepositProductsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutRecurringDepositProductsResponse: Codable {

    public var resourceId: Int?
    public var changes: PutRecurringDepositProductsChanges?

    public init(resourceId: Int?, changes: PutRecurringDepositProductsChanges?) {
        self.resourceId = resourceId
        self.changes = changes
    }


}

