//
// PostCollectionSheetResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostCollectionSheetResponse: Codable {

    public var groupId: Int?
    public var resourceId: Int?
    public var changes: PostCollectionSheetChanges?

    public init(groupId: Int?, resourceId: Int?, changes: PostCollectionSheetChanges?) {
        self.groupId = groupId
        self.resourceId = resourceId
        self.changes = changes
    }


}

