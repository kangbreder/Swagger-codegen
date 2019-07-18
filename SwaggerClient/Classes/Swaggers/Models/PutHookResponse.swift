//
// PutHookResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutHookResponse: Codable {

    public var resourceId: Int64?
    public var changes: PutHookResponseChangesSwagger?

    public init(resourceId: Int64?, changes: PutHookResponseChangesSwagger?) {
        self.resourceId = resourceId
        self.changes = changes
    }


}

