//
// PutFinancialActivityAccountsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutFinancialActivityAccountsResponse: Codable {

    public var resourceId: Int64?
    public var comments: PutFinancialActivityAccountscommentsSwagger?

    public init(resourceId: Int64?, comments: PutFinancialActivityAccountscommentsSwagger?) {
        self.resourceId = resourceId
        self.comments = comments
    }


}
