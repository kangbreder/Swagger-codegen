//
// PutTaxesGroupTaxComponents.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutTaxesGroupTaxComponents: Codable {

    public var _id: Int?
    public var taxComponentId: Int?
    public var endDate: String?

    public init(_id: Int?, taxComponentId: Int?, endDate: String?) {
        self._id = _id
        self.taxComponentId = taxComponentId
        self.endDate = endDate
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case taxComponentId
        case endDate
    }


}

