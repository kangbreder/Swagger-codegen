//
// PutAccountNumberFormatsResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutAccountNumberFormatsResponse: Codable {

    public var resourceId: Int64?
    public var changes: PutAccountNumberFormatschangesSwagger?

    public init(resourceId: Int64?, changes: PutAccountNumberFormatschangesSwagger?) {
        self.resourceId = resourceId
        self.changes = changes
    }


}
