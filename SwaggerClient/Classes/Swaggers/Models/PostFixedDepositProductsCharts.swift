//
// PostFixedDepositProductsCharts.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct PostFixedDepositProductsCharts: Codable {

    public var fromDate: String?
    public var locale: String?
    public var dateFormat: String?
    public var chartSlabs: [PostFixedDepositProductsChartSlabs]?

    public init(fromDate: String?, locale: String?, dateFormat: String?, chartSlabs: [PostFixedDepositProductsChartSlabs]?) {
        self.fromDate = fromDate
        self.locale = locale
        self.dateFormat = dateFormat
        self.chartSlabs = chartSlabs
    }


}

