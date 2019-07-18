//
// FinancialActivityData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct FinancialActivityData: Codable {

    public enum MappedGLAccountType: String, Codable { 
        case asset = "ASSET"
        case liability = "LIABILITY"
        case equity = "EQUITY"
        case income = "INCOME"
        case expense = "EXPENSE"
    }
    public var _id: Int?
    public var name: String?
    public var mappedGLAccountType: MappedGLAccountType?

    public init(_id: Int?, name: String?, mappedGLAccountType: MappedGLAccountType?) {
        self._id = _id
        self.name = name
        self.mappedGLAccountType = mappedGLAccountType
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case name
        case mappedGLAccountType
    }


}

