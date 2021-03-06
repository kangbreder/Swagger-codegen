//
// GLAccountData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GLAccountData: Codable {

    public var _id: Int64?
    public var name: String?
    public var glCode: String?
    public var type: EnumOptionData?
    public var tagId: CodeValueData?
    public var rowIndex: Int?
    public var typeId: Int?

    public init(_id: Int64?, name: String?, glCode: String?, type: EnumOptionData?, tagId: CodeValueData?, rowIndex: Int?, typeId: Int?) {
        self._id = _id
        self.name = name
        self.glCode = glCode
        self.type = type
        self.tagId = tagId
        self.rowIndex = rowIndex
        self.typeId = typeId
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case glCode
        case type
        case tagId
        case rowIndex
        case typeId
    }


}

