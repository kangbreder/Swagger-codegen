//
// Component.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct Component: Codable {

    public var _id: Int64?
    public var survey: Survey?
    public var key: String?
    public var text: String?
    public var _description: String?
    public var sequenceNo: Int?
    public var new: Bool?

    public init(_id: Int64?, survey: Survey?, key: String?, text: String?, _description: String?, sequenceNo: Int?, new: Bool?) {
        self._id = _id
        self.survey = survey
        self.key = key
        self.text = text
        self._description = _description
        self.sequenceNo = sequenceNo
        self.new = new
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case survey
        case key
        case text
        case _description = "description"
        case sequenceNo
        case new
    }


}

