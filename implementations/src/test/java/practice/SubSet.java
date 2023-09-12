package practice;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SubSet {

	public static void main(String[] args) {
		String s = "Selen";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

	}

}
