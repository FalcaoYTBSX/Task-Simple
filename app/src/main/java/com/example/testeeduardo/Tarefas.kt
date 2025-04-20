package com.example.testeeduardo.telas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Tarefas() {
    var textoTarefa by remember { mutableStateOf(TextFieldValue("")) }
    var tarefaPronta by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Escreva sua tarefa:", fontSize = 20.sp)

        Spacer(modifier = Modifier.height(16.dp))

        BasicTextField(
            value = textoTarefa,
            onValueChange = { textoTarefa = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = { tarefaPronta = true }) {
            Text("Pronto")
        }

        if (tarefaPronta) {
            Spacer(modifier = Modifier.height(24.dp))
            Text("Tarefa salva: ${textoTarefa.text}", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTarefas() {
    Tarefas()
}
