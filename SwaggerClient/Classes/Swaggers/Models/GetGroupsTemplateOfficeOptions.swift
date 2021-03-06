//
// GetGroupsTemplateOfficeOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetGroupsTemplateOfficeOptions: Codable {

    public var _id: Int?
    public var name: String?
    public var nameDecorated: String?

    public init(_id: Int?, name: String?, nameDecorated: String?) {
        self._id = _id
        self.name = name
        self.nameDecorated = nameDecorated
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case nameDecorated
    }


}

