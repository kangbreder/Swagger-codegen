//
// ResponseData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ResponseData: Codable {

    public var _id: Int64?
    public var text: String?
    public var value: Int?
    public var sequenceNo: Int?

    public init(_id: Int64?, text: String?, value: Int?, sequenceNo: Int?) {
        self._id = _id
        self.text = text
        self.value = value
        self.sequenceNo = sequenceNo
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case text
        case value
        case sequenceNo
    }


}

