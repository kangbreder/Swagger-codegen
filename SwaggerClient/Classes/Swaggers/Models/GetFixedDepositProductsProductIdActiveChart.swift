//
// GetFixedDepositProductsProductIdActiveChart.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetFixedDepositProductsProductIdActiveChart: Codable {

    public var _id: Int?
    public var fromDate: Date?
    public var savingsProductId: Int?
    public var savingsProductName: String?
    public var chartSlabs: [GetFixedDepositProductsProductIdChartSlabs]?
    public var periodTypes: [GetFixedDepositProductsProductIdPeriodType]?

    public init(_id: Int?, fromDate: Date?, savingsProductId: Int?, savingsProductName: String?, chartSlabs: [GetFixedDepositProductsProductIdChartSlabs]?, periodTypes: [GetFixedDepositProductsProductIdPeriodType]?) {
        self._id = _id
        self.fromDate = fromDate
        self.savingsProductId = savingsProductId
        self.savingsProductName = savingsProductName
        self.chartSlabs = chartSlabs
        self.periodTypes = periodTypes
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case fromDate
        case savingsProductId
        case savingsProductName
        case chartSlabs
        case periodTypes
    }


}
