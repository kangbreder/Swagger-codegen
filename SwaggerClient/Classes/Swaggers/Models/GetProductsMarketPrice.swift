//
// GetProductsMarketPrice.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetProductsMarketPrice: Codable {

    public var _id: Int?
    public var fromDate: String?
    public var shareValue: Int?

    public init(_id: Int?, fromDate: String?, shareValue: Int?) {
        self._id = _id
        self.fromDate = fromDate
        self.shareValue = shareValue
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case fromDate
        case shareValue
    }


}

