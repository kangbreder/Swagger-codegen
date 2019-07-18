//
// PostGLAccountsRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostGLAccountsRequest: Codable {

    public var name: String?
    public var glCode: String?
    public var manualEntriesAllowed: Bool?
    public var type: String?
    public var tagId: String?
    public var parentId: Int64?
    public var usage: EnumOptionData?
    public var _description: String?

    public init(name: String?, glCode: String?, manualEntriesAllowed: Bool?, type: String?, tagId: String?, parentId: Int64?, usage: EnumOptionData?, _description: String?) {
        self.name = name
        self.glCode = glCode
        self.manualEntriesAllowed = manualEntriesAllowed
        self.type = type
        self.tagId = tagId
        self.parentId = parentId
        self.usage = usage
        self._description = _description
    }

    public enum CodingKeys: String, CodingKey { 
        case name
        case glCode
        case manualEntriesAllowed
        case type
        case tagId
        case parentId
        case usage
        case _description = "description"
    }


}

