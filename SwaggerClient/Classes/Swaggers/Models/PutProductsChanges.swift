//
// PutProductsChanges.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutProductsChanges: Codable {

    public var _description: String?
    public var unitPrice: Double?
    public var locale: String?

    public init(_description: String?, unitPrice: Double?, locale: String?) {
        self._description = _description
        self.unitPrice = unitPrice
        self.locale = locale
    }

    public enum CodingKeys: String, CodingKey { 
        case _description = "description"
        case unitPrice
        case locale
    }


}

