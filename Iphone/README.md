## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


<mxfile host="app.diagrams.net" agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36 OPR/112.0.0.0" version="24.7.10">
  <diagram name="Página-1" id="gU-d12Q-FuM-2TMF3Xk4">
    <mxGraphModel grid="1" page="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" pageScale="1" pageWidth="827" pageHeight="1169" math="0" shadow="0">
      <root>
        <mxCell id="0" />
        <mxCell id="1" parent="0" />
        <mxCell id="YIJ-H509hu39ucRgioOh-7" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=0;entryY=0.5;entryDx=0;entryDy=0;curved=1;" edge="1" parent="1" source="YIJ-H509hu39ucRgioOh-2" target="YIJ-H509hu39ucRgioOh-6">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="130" y="115" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="YIJ-H509hu39ucRgioOh-2" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;i&gt;&amp;lt;&amp;lt;Interface&amp;gt;&amp;gt;&lt;/i&gt;&lt;br&gt;&lt;b&gt;ReprodutorMusical&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;&lt;br&gt;&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ tocar(): void&amp;nbsp;&lt;br&gt;+ pausar(): void&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ selecionarMusica(String): void&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="40" y="260" width="190" height="140" as="geometry" />
        </mxCell>
        <mxCell id="YIJ-H509hu39ucRgioOh-8" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;exitX=0.5;exitY=0;exitDx=0;exitDy=0;entryX=0.5;entryY=1;entryDx=0;entryDy=0;" edge="1" parent="1" source="YIJ-H509hu39ucRgioOh-4" target="YIJ-H509hu39ucRgioOh-6">
          <mxGeometry relative="1" as="geometry" />
        </mxCell>
        <mxCell id="YIJ-H509hu39ucRgioOh-4" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;i&gt;&amp;lt;&amp;lt;Interface&amp;gt;&amp;gt;&lt;/i&gt;&lt;br&gt;&lt;b&gt;AparelhoTelefonico&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;&lt;br&gt;&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ ligar(String): void&lt;br&gt;+ atender(): void&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ iniciarCorreioVoz: void&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="310" y="260" width="190" height="140" as="geometry" />
        </mxCell>
        <mxCell id="YIJ-H509hu39ucRgioOh-9" style="edgeStyle=orthogonalEdgeStyle;rounded=0;orthogonalLoop=1;jettySize=auto;html=1;entryX=1;entryY=0.5;entryDx=0;entryDy=0;curved=1;" edge="1" parent="1" source="YIJ-H509hu39ucRgioOh-5" target="YIJ-H509hu39ucRgioOh-6">
          <mxGeometry relative="1" as="geometry">
            <Array as="points">
              <mxPoint x="680" y="115" />
            </Array>
          </mxGeometry>
        </mxCell>
        <mxCell id="YIJ-H509hu39ucRgioOh-5" value="&lt;p style=&quot;margin:0px;margin-top:4px;text-align:center;&quot;&gt;&lt;i&gt;&amp;lt;&amp;lt;Interface&amp;gt;&amp;gt;&lt;/i&gt;&lt;br&gt;&lt;b&gt;NavegadorInternet&lt;/b&gt;&lt;/p&gt;&lt;hr size=&quot;1&quot; style=&quot;border-style:solid;&quot;&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;&lt;br&gt;&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ exibirPagina(String): void&lt;br&gt;+ adicionarNovaAba(): void&lt;/p&gt;&lt;p style=&quot;margin:0px;margin-left:4px;&quot;&gt;+ atualizarPagina: void&lt;/p&gt;" style="verticalAlign=top;align=left;overflow=fill;html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="590" y="260" width="190" height="140" as="geometry" />
        </mxCell>
        <mxCell id="YIJ-H509hu39ucRgioOh-6" value="Iphone" style="html=1;whiteSpace=wrap;" vertex="1" parent="1">
          <mxGeometry x="350" y="90" width="110" height="50" as="geometry" />
        </mxCell>
      </root>
    </mxGraphModel>
  </diagram>
</mxfile>
