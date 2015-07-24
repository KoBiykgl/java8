<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:tns="http://www.example.org/Demo">
	<xsl:template match="/">

		<html>

			<body>

				<h1>
					<xsl:value-of select="tns:Person/tns:Name" />
				</h1>
				<p>
					<xsl:value-of select="tns:Person/tns:Address/tns:Street" />
				</p>
				<p>
					<xsl:value-of select="tns:Person/tns:Address/tns:Number" />
				</p>

			</body>

		</html>


	</xsl:template>
</xsl:stylesheet>