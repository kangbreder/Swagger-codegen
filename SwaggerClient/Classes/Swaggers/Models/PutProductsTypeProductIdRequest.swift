//
// PutProductsTypeProductIdRequest.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PutProductsTypeProductIdRequest: Codable {

    public var _description: String?
    public var locale: String?
    public var unitPrice: Double?

    public init(_description: String?, locale: String?, unitPrice: Double?) {
        self._description = _description
        self.locale = locale
        self.unitPrice = unitPrice
    }

    public enum CodingKeys: String, CodingKey { 
        case _description = "description"
        case locale
        case unitPrice
    }


}
