//
// GetFixedDepositProductsMaxDepositTermType.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetFixedDepositProductsMaxDepositTermType: Codable {

    public var _id: Int?
    public var code: String?
    public var value: String?

    public init(_id: Int?, code: String?, value: String?) {
        self._id = _id
        self.code = code
        self.value = value
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case code
        case value
    }


}

