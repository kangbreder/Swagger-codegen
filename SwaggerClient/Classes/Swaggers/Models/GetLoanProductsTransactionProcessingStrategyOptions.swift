//
// GetLoanProductsTransactionProcessingStrategyOptions.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoanProductsTransactionProcessingStrategyOptions: Codable {

    public var _id: Int?
    public var code: String?
    public var name: String?

    public init(_id: Int?, code: String?, name: String?) {
        self._id = _id
        self.code = code
        self.name = name
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case code
        case name
    }


}
