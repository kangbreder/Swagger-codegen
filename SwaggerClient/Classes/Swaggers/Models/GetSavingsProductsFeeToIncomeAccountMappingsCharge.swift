//
// GetSavingsProductsFeeToIncomeAccountMappingsCharge.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetSavingsProductsFeeToIncomeAccountMappingsCharge: Codable {

    public var _id: Int?
    public var name: String?
    public var active: Bool?
    public var penalty: Bool?

    public init(_id: Int?, name: String?, active: Bool?, penalty: Bool?) {
        self._id = _id
        self.name = name
        self.active = active
        self.penalty = penalty
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case active
        case penalty
    }


}
