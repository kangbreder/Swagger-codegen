//
// GetInterestRateChartsChartIdChartSlabsEntityType.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetInterestRateChartsChartIdChartSlabsEntityType: Codable {

    public var _id: Int?
    public var code: Int?
    public var value: Int?

    public init(_id: Int?, code: Int?, value: Int?) {
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

