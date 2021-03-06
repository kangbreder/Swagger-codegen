//
// ComponentData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ComponentData: Codable {

    public var _id: Int64?
    public var key: String?
    public var text: String?
    public var _description: String?
    public var sequenceNo: Int?

    public init(_id: Int64?, key: String?, text: String?, _description: String?, sequenceNo: Int?) {
        self._id = _id
        self.key = key
        self.text = text
        self._description = _description
        self.sequenceNo = sequenceNo
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case key
        case text
        case _description = "description"
        case sequenceNo
    }


}

