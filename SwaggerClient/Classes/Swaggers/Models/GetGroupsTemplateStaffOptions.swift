//
// GetGroupsTemplateStaffOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetGroupsTemplateStaffOptions: Codable {

    public var _id: Int?
    public var displayName: String?

    public init(_id: Int?, displayName: String?) {
        self._id = _id
        self.displayName = displayName
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case displayName
    }


}

